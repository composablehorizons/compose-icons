package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Multiple_airports: ImageVector
    get() {
        if (_Multiple_airports != null) return _Multiple_airports!!
        
        _Multiple_airports = ImageVector.Builder(
            name = "multiple_airports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330f, 580f)
                lineToRelative(70f, -20f)
                lineToRelative(70f, 20f)
                verticalLineToRelative(-30f)
                lineToRelative(-40f, -30f)
                verticalLineToRelative(-100f)
                lineToRelative(130f, 40f)
                verticalLineToRelative(-40f)
                lineToRelative(-130f, -80f)
                verticalLineToRelative(-88f)
                quadToRelative(0f, -12f, -9f, -22f)
                reflectiveQuadToRelative(-21f, -10f)
                quadToRelative(-13f, 0f, -21.5f, 10f)
                reflectiveQuadToRelative(-8.5f, 22f)
                verticalLineToRelative(88f)
                lineToRelative(-130f, 80f)
                verticalLineToRelative(40f)
                lineToRelative(130f, -40f)
                verticalLineToRelative(100f)
                lineToRelative(-40f, 30f)
                verticalLineToRelative(30f)
                close()
                moveTo(606f, 880f)
                quadToRelative(-15f, 0f, -26f, -10.5f)
                reflectiveQuadTo(569f, 844f)
                quadToRelative(0f, -8f, 3f, -16f)
                reflectiveQuadToRelative(9f, -14f)
                quadToRelative(86f, -92f, 152.5f, -196f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, -79f, -24f, -147f)
                reflectiveQuadToRelative(-66f, -115f)
                quadToRelative(-5f, -5f, -7.5f, -12f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -17f, 11f, -28f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(12.5f, 9f)
                quadToRelative(56f, 60f, 84.5f, 142f)
                reflectiveQuadTo(880f, 408f)
                quadToRelative(0f, 121f, -74.5f, 242f)
                reflectiveQuadTo(634f, 868f)
                quadToRelative(-5f, 6f, -12.5f, 9f)
                reflectiveQuadTo(606f, 880f)
                close()
                moveTo(400f, 774f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(640f, 408f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(400f, 774f)
                close()
                moveToRelative(0f, 106f)
                quadTo(239f, 743f, 159.5f, 625.5f)
                reflectiveQuadTo(80f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(400f, 880f)
                close()
                moveToRelative(0f, -472f)
                close()
            }
        }.build()
        
        return _Multiple_airports!!
    }

private var _Multiple_airports: ImageVector? = null

