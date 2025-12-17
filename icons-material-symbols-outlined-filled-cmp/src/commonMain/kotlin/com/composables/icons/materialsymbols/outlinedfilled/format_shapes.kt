package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Format_shapes: ImageVector
    get() {
        if (_Format_shapes != null) return _Format_shapes!!
        
        _Format_shapes = ImageVector.Builder(
            name = "format_shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 920f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, -160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(32f, -120f)
                lineToRelative(136f, -360f)
                horizontalLineToRelative(64f)
                lineToRelative(136f, 360f)
                horizontalLineToRelative(-62f)
                lineToRelative(-32f, -92f)
                horizontalLineTo(408f)
                lineToRelative(-32f, 92f)
                horizontalLineToRelative(-64f)
                close()
                moveToRelative(114f, -144f)
                horizontalLineToRelative(108f)
                lineToRelative(-52f, -150f)
                horizontalLineToRelative(-4f)
                lineToRelative(-52f, 150f)
                close()
            }
        }.build()
        
        return _Format_shapes!!
    }

private var _Format_shapes: ImageVector? = null

