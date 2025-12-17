package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Eda: ImageVector
    get() {
        if (_Eda != null) return _Eda!!
        
        _Eda = ImageVector.Builder(
            name = "eda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 120f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 440f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                close()
                moveToRelative(160f, -40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 440f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                close()
                moveToRelative(120f, 603f)
                verticalLineToRelative(-483f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(436f)
                lineToRelative(-80f, 47f)
                close()
                moveToRelative(-400f, -3f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 840f)
                horizontalLineToRelative(267f)
                quadToRelative(8f, 0f, 15f, -3.5f)
                reflectiveQuadToRelative(13f, -8.5f)
                lineToRelative(182f, -182f)
                lineToRelative(-226f, 131f)
                quadToRelative(-26f, 15f, -56f, 9f)
                reflectiveQuadToRelative(-48f, -30f)
                lineToRelative(-87f, -116f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, 280f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(220f)
                quadToRelative(19f, 0f, 36f, 8.5f)
                reflectiveQuadToRelative(28f, 23.5f)
                lineToRelative(86f, 115f)
                lineToRelative(190f, -111f)
                lineToRelative(90f, -52f)
                quadToRelative(21f, -12f, 44.5f, -10.5f)
                reflectiveQuadTo(858f, 549f)
                quadToRelative(25f, 19f, 27f, 50f)
                reflectiveQuadToRelative(-20f, 53f)
                lineTo(632f, 885f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-80f, -360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
                moveToRelative(80f, 360f)
                horizontalLineToRelative(295f)
                horizontalLineToRelative(-295f)
                close()
            }
        }.build()
        
        return _Eda!!
    }

private var _Eda: ImageVector? = null

