package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Deployed_code_update: ImageVector
    get() {
        if (_Deployed_code_update != null) return _Deployed_code_update!!
        
        _Deployed_code_update = ImageVector.Builder(
            name = "deployed_code_update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                lineToRelative(120f, -120f)
                lineToRelative(-28f, -28f)
                lineToRelative(-72f, 72f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(164f)
                lineToRelative(-72f, -72f)
                lineToRelative(-28f, 28f)
                lineTo(720f, 880f)
                close()
                moveTo(480f, 434f)
                lineTo(243f, 297f)
                lineToRelative(-43f, 25f)
                verticalLineToRelative(42f)
                lineToRelative(280f, 162f)
                lineToRelative(280f, -162f)
                verticalLineToRelative(-42f)
                lineToRelative(-43f, -25f)
                lineToRelative(-237f, 137f)
                close()
                moveTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(232f)
                quadToRelative(-27f, -13f, -57.5f, -20f)
                reflectiveQuadToRelative(-62.5f, -7f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 27f, 5f, 53f)
                reflectiveQuadToRelative(15f, 50f)
                lineToRelative(10f, 23f)
                lineToRelative(-350f, -201f)
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
            }
        }.build()
        
        return _Deployed_code_update!!
    }

private var _Deployed_code_update: ImageVector? = null

