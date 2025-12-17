package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                lineTo(120f, 600f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                lineToRelative(120f, 120f)
                lineToRelative(-120f, 120f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 320f)
                horizontalLineToRelative(447f)
                lineToRelative(40f, -40f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(33f, 320f)
                horizontalLineToRelative(447f)
                verticalLineToRelative(-80f)
                horizontalLineTo(273f)
                lineToRelative(-40f, 40f)
                lineToRelative(40f, 40f)
                close()
                moveToRelative(-33f, -320f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, 320f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

