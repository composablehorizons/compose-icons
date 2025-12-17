package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Eyeglasses: ImageVector
    get() {
        if (_Eyeglasses != null) return _Eyeglasses!!
        
        _Eyeglasses = ImageVector.Builder(
            name = "eyeglasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(274f, 600f)
                quadToRelative(31f, 0f, 55.5f, -18f)
                reflectiveQuadToRelative(34.5f, -47f)
                lineToRelative(15f, -46f)
                quadToRelative(16f, -48f, -8f, -88.5f)
                reflectiveQuadTo(302f, 360f)
                horizontalLineTo(161f)
                lineToRelative(19f, 157f)
                quadToRelative(5f, 35f, 31.5f, 59f)
                reflectiveQuadToRelative(62.5f, 24f)
                close()
                moveToRelative(412f, 0f)
                quadToRelative(36f, 0f, 62.5f, -24f)
                reflectiveQuadToRelative(31.5f, -59f)
                lineToRelative(19f, -157f)
                horizontalLineTo(659f)
                quadToRelative(-45f, 0f, -69f, 41f)
                reflectiveQuadToRelative(-8f, 89f)
                lineToRelative(14f, 45f)
                quadToRelative(10f, 29f, 34.5f, 47f)
                reflectiveQuadToRelative(55.5f, 18f)
                close()
                moveToRelative(-412f, 80f)
                quadToRelative(-66f, 0f, -115.5f, -43.5f)
                reflectiveQuadTo(101f, 527f)
                lineTo(80f, 360f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(262f)
                quadToRelative(44f, 0f, 80.5f, 21.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineToRelative(81f)
                quadToRelative(21f, -37f, 57.5f, -58.5f)
                reflectiveQuadTo(659f, 280f)
                horizontalLineToRelative(261f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                lineToRelative(-21f, 167f)
                quadToRelative(-8f, 66f, -57.5f, 109.5f)
                reflectiveQuadTo(686f, 680f)
                quadToRelative(-57f, 0f, -102.5f, -32.5f)
                reflectiveQuadTo(520f, 561f)
                lineToRelative(-15f, -45f)
                quadToRelative(-2f, -7f, -4f, -14.5f)
                reflectiveQuadToRelative(-4f, -21.5f)
                horizontalLineToRelative(-34f)
                quadToRelative(-2f, 12f, -4f, 19.5f)
                reflectiveQuadToRelative(-4f, 14.5f)
                lineToRelative(-15f, 46f)
                quadToRelative(-18f, 54f, -63.5f, 87f)
                reflectiveQuadTo(274f, 680f)
                close()
            }
        }.build()
        
        return _Eyeglasses!!
    }

private var _Eyeglasses: ImageVector? = null

