package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Thumb_down: ImageVector
    get() {
        if (_Thumb_down != null) return _Thumb_down!!
        
        _Thumb_down = ImageVector.Builder(
            name = "thumb_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 120f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(520f)
                lineTo(400f, 920f)
                lineToRelative(-50f, -50f)
                quadToRelative(-7f, -7f, -11.5f, -19f)
                reflectiveQuadToRelative(-4.5f, -23f)
                verticalLineToRelative(-14f)
                lineToRelative(44f, -174f)
                horizontalLineTo(120f)
                quadToRelative(-32f, 0f, -56f, -24f)
                reflectiveQuadToRelative(-24f, -56f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -7f, 2f, -15f)
                reflectiveQuadToRelative(4f, -15f)
                lineToRelative(120f, -282f)
                quadToRelative(9f, -20f, 30f, -34f)
                reflectiveQuadToRelative(44f, -14f)
                close()
                moveToRelative(360f, 80f)
                horizontalLineTo(240f)
                lineTo(120f, 480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(360f)
                lineToRelative(-54f, 220f)
                lineToRelative(174f, -174f)
                verticalLineToRelative(-406f)
                close()
                moveToRelative(0f, 406f)
                verticalLineToRelative(-406f)
                verticalLineToRelative(406f)
                close()
                moveToRelative(80f, 34f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-360f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(520f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

