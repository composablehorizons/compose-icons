package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rest_area: ImageVector
    get() {
        if (_Rest_area != null) return _Rest_area!!
        
        _Rest_area = ImageVector.Builder(
            name = "rest_area",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 394f)
                lineToRelative(151f, -128f)
                lineToRelative(128f, 118f)
                lineToRelative(159f, -158f)
                lineToRelative(202f, 168f)
                verticalLineToRelative(-234f)
                horizontalLineTo(160f)
                verticalLineToRelative(234f)
                close()
                moveToRelative(40f, 486f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 640f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(560f)
                horizontalLineTo(760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-61f)
                lineTo(602f, 334f)
                lineTo(441f, 495f)
                lineTo(309f, 373f)
                lineTo(160f, 498f)
                verticalLineToRelative(62f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -480f)
                close()
            }
        }.build()
        
        return _Rest_area!!
    }

private var _Rest_area: ImageVector? = null

