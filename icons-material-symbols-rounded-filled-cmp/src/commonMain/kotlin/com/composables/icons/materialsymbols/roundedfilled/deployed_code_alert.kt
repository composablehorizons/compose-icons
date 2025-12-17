package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Deployed_code_alert: ImageVector
    get() {
        if (_Deployed_code_alert != null) return _Deployed_code_alert!!
        
        _Deployed_code_alert = ImageVector.Builder(
            name = "deployed_code_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 514f)
                quadToRelative(11f, 0f, 21f, -3f)
                reflectiveQuadToRelative(19f, -8f)
                lineToRelative(203f, -117f)
                quadToRelative(14f, -8f, 18f, -24.5f)
                reflectiveQuadToRelative(-4f, -30.5f)
                quadToRelative(-8f, -14f, -24f, -18f)
                reflectiveQuadToRelative(-30f, 4f)
                lineTo(480f, 434f)
                lineTo(277f, 317f)
                quadToRelative(-14f, -8f, -30f, -4f)
                reflectiveQuadToRelative(-24f, 18f)
                quadToRelative(-8f, 14f, -3.5f, 30.5f)
                reflectiveQuadTo(238f, 386f)
                lineToRelative(202f, 117f)
                quadToRelative(9f, 5f, 19f, 8f)
                reflectiveQuadToRelative(21f, 3f)
                close()
                moveTo(120f, 639f)
                verticalLineToRelative(-318f)
                quadToRelative(0f, -22f, 10.5f, -40f)
                reflectiveQuadToRelative(29.5f, -29f)
                lineToRelative(280f, -161f)
                quadToRelative(10f, -5f, 19.5f, -8f)
                reflectiveQuadToRelative(20.5f, -3f)
                quadToRelative(11f, 0f, 21f, 3f)
                reflectiveQuadToRelative(19f, 8f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29f)
                reflectiveQuadToRelative(10.5f, 40f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 18f, -15f, 28f)
                reflectiveQuadToRelative(-32f, 5f)
                quadToRelative(-17f, -5f, -35.5f, -7.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                verticalLineToRelative(20.5f)
                quadToRelative(0f, 9.5f, 2f, 17.5f)
                quadToRelative(4f, 25f, -14.5f, 39f)
                reflectiveQuadToRelative(-38.5f, 3f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29f)
                reflectiveQuadTo(120f, 639f)
                close()
                moveTo(720f, 960f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 760f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 960f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
            }
        }.build()
        
        return _Deployed_code_alert!!
    }

private var _Deployed_code_alert: ImageVector? = null

