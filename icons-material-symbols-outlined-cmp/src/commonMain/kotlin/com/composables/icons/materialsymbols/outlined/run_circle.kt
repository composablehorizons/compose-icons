package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Run_circle: ImageVector
    get() {
        if (_Run_circle != null) return _Run_circle!!
        
        _Run_circle = ImageVector.Builder(
            name = "run_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 720f)
                verticalLineToRelative(-143f)
                lineToRelative(-45f, -49f)
                lineToRelative(-21f, 106f)
                lineToRelative(-150f, -31f)
                lineToRelative(8f, -39f)
                lineToRelative(111f, 23f)
                lineToRelative(39f, -196f)
                lineToRelative(-62f, 23f)
                verticalLineToRelative(66f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-94f)
                lineToRelative(131f, -48f)
                quadToRelative(15f, -5f, 29.5f, 1f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(25f, 51f, 55.5f, 66f)
                reflectiveQuadToRelative(42.5f, 15f)
                verticalLineToRelative(40f)
                quadToRelative(-21f, 0f, -55f, -16.5f)
                reflectiveQuadTo(524f, 410f)
                lineToRelative(-17f, 94f)
                lineToRelative(53f, 57f)
                verticalLineToRelative(159f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(20f, -400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 320f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
            }
        }.build()
        
        return _Run_circle!!
    }

private var _Run_circle: ImageVector? = null

