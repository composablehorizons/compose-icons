package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Deployed_code_alert: ImageVector
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
                moveTo(480f, 160f)
                lineTo(243f, 297f)
                lineToRelative(237f, 137f)
                lineToRelative(237f, -137f)
                lineToRelative(-237f, -137f)
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
                verticalLineToRelative(159f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-116f)
                lineTo(479f, 526f)
                lineTo(200f, 364f)
                verticalLineToRelative(274f)
                lineToRelative(240f, 139f)
                verticalLineToRelative(92f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29f)
                reflectiveQuadTo(120f, 639f)
                close()
                moveTo(720f, 880f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(-20f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
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
                moveTo(480f, 469f)
                close()
            }
        }.build()
        
        return _Deployed_code_alert!!
    }

private var _Deployed_code_alert: ImageVector? = null

