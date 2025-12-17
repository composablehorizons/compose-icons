package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Groups_3: ImageVector
    get() {
        if (_Groups_3 != null) return _Groups_3!!
        
        _Groups_3 = ImageVector.Builder(
            name = "groups_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 541f)
                lineToRelative(101f, -101f)
                lineToRelative(-101f, -101f)
                lineTo(59f, 440f)
                lineToRelative(101f, 101f)
                close()
                moveToRelative(540f, -21f)
                lineToRelative(100f, -160f)
                lineToRelative(100f, 160f)
                horizontalLineTo(700f)
                close()
                moveToRelative(-220f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(0f, 40f)
                close()
                moveTo(0f, 720f)
                verticalLineToRelative(-63f)
                quadToRelative(0f, -44f, 44.5f, -70.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(13f, 0f, 25f, 0.5f)
                reflectiveQuadToRelative(23f, 2.5f)
                quadToRelative(-14f, 20f, -21f, 43f)
                reflectiveQuadToRelative(-7f, 49f)
                verticalLineToRelative(65f)
                horizontalLineTo(0f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-65f)
                quadToRelative(0f, -65f, 66.5f, -105f)
                reflectiveQuadTo(480f, 510f)
                quadToRelative(108f, 0f, 174f, 40f)
                reflectiveQuadToRelative(66f, 105f)
                verticalLineToRelative(65f)
                horizontalLineTo(240f)
                close()
                moveToRelative(560f, -160f)
                quadToRelative(72f, 0f, 116f, 26.5f)
                reflectiveQuadToRelative(44f, 70.5f)
                verticalLineToRelative(63f)
                horizontalLineTo(780f)
                verticalLineToRelative(-65f)
                quadToRelative(0f, -26f, -6.5f, -49f)
                reflectiveQuadTo(754f, 563f)
                quadToRelative(11f, -2f, 22.5f, -2.5f)
                reflectiveQuadToRelative(23.5f, -0.5f)
                close()
                moveToRelative(-320f, 30f)
                quadToRelative(-57f, 0f, -102f, 15f)
                reflectiveQuadToRelative(-53f, 35f)
                horizontalLineToRelative(311f)
                quadToRelative(-9f, -20f, -53.5f, -35f)
                reflectiveQuadTo(480f, 590f)
                close()
                moveToRelative(0f, 50f)
                close()
            }
        }.build()
        
        return _Groups_3!!
    }

private var _Groups_3: ImageVector? = null

