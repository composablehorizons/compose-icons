package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Identity_platform: ImageVector
    get() {
        if (_Identity_platform != null) return _Identity_platform!!
        
        _Identity_platform = ImageVector.Builder(
            name = "identity_platform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 782f)
                quadToRelative(20f, 12f, 42f, 11.5f)
                reflectiveQuadToRelative(42f, -12.5f)
                lineToRelative(182f, -111f)
                quadToRelative(-50f, -35f, -107f, -52.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-60f, 0f, -117.5f, 17.5f)
                reflectiveQuadTo(254f, 669f)
                lineToRelative(184f, 113f)
                close()
                moveToRelative(42f, -262f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(438f, 875f)
                lineTo(158f, 703f)
                quadToRelative(-18f, -11f, -28f, -29f)
                reflectiveQuadToRelative(-10f, -39f)
                verticalLineToRelative(-310f)
                quadToRelative(0f, -21f, 10f, -39f)
                reflectiveQuadToRelative(28f, -29f)
                lineToRelative(280f, -172f)
                quadToRelative(20f, -12f, 42f, -12f)
                reflectiveQuadToRelative(42f, 12f)
                lineToRelative(280f, 172f)
                quadToRelative(18f, 11f, 28f, 29f)
                reflectiveQuadToRelative(10f, 39f)
                verticalLineToRelative(310f)
                quadToRelative(0f, 21f, -10f, 39f)
                reflectiveQuadToRelative(-28f, 29f)
                lineTo(522f, 875f)
                quadToRelative(-20f, 12f, -42f, 12f)
                reflectiveQuadToRelative(-42f, -12f)
                close()
            }
        }.build()
        
        return _Identity_platform!!
    }

private var _Identity_platform: ImageVector? = null

