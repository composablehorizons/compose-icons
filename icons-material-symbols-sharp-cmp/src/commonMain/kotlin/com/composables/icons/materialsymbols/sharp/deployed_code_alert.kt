package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Deployed_code_alert: ImageVector
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
                moveTo(480f, 434f)
                lineToRelative(237f, -137f)
                lineToRelative(-237f, -137f)
                lineToRelative(-237f, 137f)
                lineToRelative(237f, 137f)
                close()
                moveTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(205f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-116f)
                lineTo(479f, 526f)
                lineTo(200f, 364f)
                verticalLineToRelative(274f)
                lineToRelative(241f, 139f)
                verticalLineToRelative(92f)
                lineTo(120f, 685f)
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
                moveTo(441f, 469f)
                close()
            }
        }.build()
        
        return _Deployed_code_alert!!
    }

private var _Deployed_code_alert: ImageVector? = null

