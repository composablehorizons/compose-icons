package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Night_sight_auto_off: ImageVector
    get() {
        if (_Night_sight_auto_off != null) return _Night_sight_auto_off!!
        
        _Night_sight_auto_off = ImageVector.Builder(
            name = "night_sight_auto_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 375f)
                lineTo(272f, 247f)
                quadToRelative(38f, -23f, 80.5f, -35f)
                reflectiveQuadToRelative(87.5f, -12f)
                quadToRelative(5f, 0f, 10f, 0.5f)
                reflectiveQuadToRelative(10f, 0.5f)
                quadToRelative(-29f, 32f, -44.5f, 73f)
                reflectiveQuadTo(400f, 360f)
                verticalLineToRelative(15f)
                close()
                moveToRelative(313f, 313f)
                lineToRelative(-88f, -88f)
                quadToRelative(35f, 2f, 68f, -5.5f)
                reflectiveQuadToRelative(63f, -24.5f)
                quadToRelative(-5f, 32f, -15.5f, 61.5f)
                reflectiveQuadTo(713f, 688f)
                close()
                moveTo(552f, 440f)
                lineToRelative(128f, -360f)
                horizontalLineToRelative(80f)
                lineToRelative(128f, 360f)
                horizontalLineToRelative(-76f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(656f)
                lineToRelative(-28f, 80f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(122f, -134f)
                horizontalLineToRelative(92f)
                lineToRelative(-46f, -146f)
                lineToRelative(-46f, 146f)
                close()
                moveTo(537f, 740f)
                lineTo(220f, 423f)
                quadToRelative(-10f, 23f, -15f, 47.5f)
                reflectiveQuadToRelative(-5f, 49.5f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(25f, 0f, 49.5f, -5f)
                reflectiveQuadToRelative(47.5f, -15f)
                close()
                moveTo(791f, 880f)
                lineToRelative(-57f, 57f)
                lineToRelative(-138f, -138f)
                quadToRelative(-36f, 20f, -75f, 30.5f)
                reflectiveQuadTo(440f, 840f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -42f, 10.5f, -81f)
                reflectiveQuadToRelative(30.5f, -75f)
                lineTo(14f, 217f)
                lineToRelative(57f, -57f)
                lineTo(791f, 880f)
                close()
                moveTo(379f, 582f)
                close()
            }
        }.build()
        
        return _Night_sight_auto_off!!
    }

private var _Night_sight_auto_off: ImageVector? = null

