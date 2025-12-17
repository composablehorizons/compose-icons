package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Identity_platform: ImageVector
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
                moveTo(480f, 807f)
                lineToRelative(224f, -137f)
                quadToRelative(-50f, -35f, -107f, -52.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-60f, 0f, -117.5f, 17.5f)
                reflectiveQuadTo(254f, 669f)
                lineToRelative(226f, 138f)
                close()
                moveToRelative(0f, -287f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, 380f)
                lineTo(120f, 680f)
                verticalLineToRelative(-400f)
                lineToRelative(360f, -220f)
                lineToRelative(360f, 220f)
                verticalLineToRelative(400f)
                lineTo(480f, 900f)
                close()
            }
        }.build()
        
        return _Identity_platform!!
    }

private var _Identity_platform: ImageVector? = null

