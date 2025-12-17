package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Owl: ImageVector
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
                moveTo(480f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -122f, 96f, -201f)
                reflectiveQuadToRelative(224f, -79f)
                quadToRelative(128f, 0f, 224f, 79f)
                reflectiveQuadToRelative(96f, 201f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(80f)
                quadToRelative(-19f, -25f, -29.5f, -55.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(-42f)
                quadToRelative(-10f, 1f, -20f, 1.5f)
                reflectiveQuadToRelative(-20f, 0.5f)
                quadToRelative(-67f, 0f, -129.5f, -23.5f)
                reflectiveQuadTo(240f, 545f)
                verticalLineToRelative(15f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                verticalLineToRelative(-255f)
                quadToRelative(-26f, 26f, -56f, 44.5f)
                reflectiveQuadTo(600f, 620f)
                verticalLineToRelative(60f)
                close()
                moveTo(480f, 560f)
                quadToRelative(95f, 0f, 167.5f, -55.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -35f, -12f, -65.5f)
                reflectiveQuadTo(674f, 240f)
                quadToRelative(-64f, 2f, -109f, 48f)
                reflectiveQuadToRelative(-45f, 112f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 400f)
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
                moveTo(370f, 182f)
                quadToRelative(34f, 14f, 62f, 37f)
                reflectiveQuadToRelative(48f, 52f)
                quadToRelative(20f, -29f, 47.5f, -52f)
                reflectiveQuadToRelative(61.5f, -37f)
                quadToRelative(-25f, -11f, -52.5f, -16.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-29f, 0f, -56.5f, 5.5f)
                reflectiveQuadTo(370f, 182f)
                close()
                moveToRelative(430f, 618f)
                horizontalLineTo(520f)
                horizontalLineToRelative(280f)
                close()
                moveToRelative(-320f, 0f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                close()
                moveTo(480f, 271f)
                close()
            }
        }.build()
        
        return _Owl!!
    }

private var _Owl: ImageVector? = null

