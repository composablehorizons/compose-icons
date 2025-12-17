package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Deployed_code: ImageVector
    get() {
        if (_Deployed_code != null) return _Deployed_code!!
        
        _Deployed_code = ImageVector.Builder(
            name = "deployed_code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 869f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29f)
                reflectiveQuadTo(120f, 639f)
                verticalLineToRelative(-318f)
                quadToRelative(0f, -22f, 10.5f, -40f)
                reflectiveQuadToRelative(29.5f, -29f)
                lineToRelative(280f, -161f)
                quadToRelative(19f, -11f, 40f, -11f)
                reflectiveQuadToRelative(40f, 11f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29f)
                reflectiveQuadToRelative(10.5f, 40f)
                verticalLineToRelative(318f)
                quadToRelative(0f, 22f, -10.5f, 40f)
                reflectiveQuadTo(800f, 708f)
                lineTo(520f, 869f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                close()
                moveToRelative(0f, -366f)
                verticalLineToRelative(274f)
                lineToRelative(40f, 23f)
                lineToRelative(40f, -23f)
                verticalLineToRelative(-274f)
                lineToRelative(240f, -139f)
                verticalLineToRelative(-42f)
                lineToRelative(-43f, -25f)
                lineToRelative(-237f, 137f)
                lineToRelative(-237f, -137f)
                lineToRelative(-43f, 25f)
                verticalLineToRelative(42f)
                lineToRelative(240f, 139f)
                close()
            }
        }.build()
        
        return _Deployed_code!!
    }

private var _Deployed_code: ImageVector? = null

