package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Owl: ImageVector
    get() {
        if (_Owl != null) return _Owl!!
        
        _Owl = ImageVector.Builder(
            name = "owl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                quadToRelative(95f, 0f, 167.5f, -55.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -35f, -12f, -65.5f)
                reflectiveQuadTo(674f, 240f)
                quadToRelative(-64f, 2f, -109f, 48f)
                reflectiveQuadToRelative(-45f, 112f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -66f, -45f, -111f)
                reflectiveQuadToRelative(-109f, -48f)
                quadToRelative(-22f, 24f, -34f, 54f)
                reflectiveQuadToRelative(-12f, 65f)
                quadToRelative(0f, 89f, 72.5f, 144.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(340f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 400f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 400f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -122f, 96f, -201f)
                reflectiveQuadToRelative(224f, -79f)
                quadToRelative(128f, 0f, 224f, 79f)
                reflectiveQuadToRelative(96f, 201f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-60f)
                quadToRelative(-20f, 7f, -40f, 11.5f)
                reflectiveQuadToRelative(-40f, 6.5f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Owl!!
    }

private var _Owl: ImageVector? = null

