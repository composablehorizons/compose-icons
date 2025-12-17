package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Attach_money: ImageVector
    get() {
        if (_Attach_money != null) return _Attach_money!!
        
        _Attach_money = ImageVector.Builder(
            name = "attach_money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(441f, 840f)
                verticalLineToRelative(-86f)
                quadToRelative(-53f, -12f, -91.5f, -46f)
                reflectiveQuadTo(293f, 612f)
                lineToRelative(74f, -30f)
                quadToRelative(15f, 48f, 44.5f, 73f)
                reflectiveQuadToRelative(77.5f, 25f)
                quadToRelative(41f, 0f, 69.5f, -18.5f)
                reflectiveQuadTo(587f, 604f)
                quadToRelative(0f, -35f, -22f, -55.5f)
                reflectiveQuadTo(463f, 502f)
                quadToRelative(-86f, -27f, -118f, -64.5f)
                reflectiveQuadTo(313f, 346f)
                quadToRelative(0f, -65f, 42f, -101f)
                reflectiveQuadToRelative(86f, -41f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(84f)
                quadToRelative(50f, 8f, 82.5f, 36.5f)
                reflectiveQuadTo(651f, 310f)
                lineToRelative(-74f, 32f)
                quadToRelative(-12f, -32f, -34f, -48f)
                reflectiveQuadToRelative(-60f, -16f)
                quadToRelative(-44f, 0f, -67f, 19.5f)
                reflectiveQuadTo(393f, 346f)
                quadToRelative(0f, 33f, 30f, 52f)
                reflectiveQuadToRelative(104f, 40f)
                quadToRelative(69f, 20f, 104.5f, 63.5f)
                reflectiveQuadTo(667f, 602f)
                quadToRelative(0f, 71f, -42f, 108f)
                reflectiveQuadToRelative(-104f, 46f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Attach_money!!
    }

private var _Attach_money: ImageVector? = null

