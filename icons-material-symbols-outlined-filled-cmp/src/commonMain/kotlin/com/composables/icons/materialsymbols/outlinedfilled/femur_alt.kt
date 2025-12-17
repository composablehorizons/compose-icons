package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Femur_alt: ImageVector
    get() {
        if (_Femur_alt != null) return _Femur_alt!!
        
        _Femur_alt = ImageVector.Builder(
            name = "femur_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 480f)
                quadToRelative(0f, -6f, -6f, -23f)
                quadToRelative(11f, -4f, 18.5f, -14f)
                reflectiveQuadToRelative(7.5f, -23f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(-13f, 0f, -23f, 7f)
                reflectiveQuadToRelative(-14f, 19f)
                lineToRelative(-146f, -70f)
                quadToRelative(1f, -3f, 3f, -16f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 320f)
                quadToRelative(0f, 6f, 7f, 22f)
                quadToRelative(-11f, 4f, -19f, 14f)
                reflectiveQuadToRelative(-8f, 24f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(14f, 0f, 24f, -7.5f)
                reflectiveQuadToRelative(14f, -19.5f)
                lineToRelative(146f, 70f)
                lineToRelative(-4f, 17f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 520f)
                close()
                moveToRelative(-421f, -60f)
                lineToRelative(243f, -339f)
                lineToRelative(257f, 117f)
                quadToRelative(64f, 29f, 102.5f, 88f)
                reflectiveQuadTo(760f, 457f)
                verticalLineToRelative(423f)
                horizontalLineTo(394f)
                quadToRelative(-16f, -47f, -24f, -92.5f)
                reflectiveQuadToRelative(-10f, -86f)
                quadToRelative(-2f, -40.5f, -0.5f, -74.5f)
                reflectiveQuadToRelative(4.5f, -58f)
                quadToRelative(-1f, 0f, 0f, 0f)
                quadToRelative(-22f, -5f, -50.5f, -12.5f)
                reflectiveQuadToRelative(-61f, -20.5f)
                quadTo(220f, 523f, 186f, 504.5f)
                reflectiveQuadTo(119f, 460f)
                close()
            }
        }.build()
        
        return _Femur_alt!!
    }

private var _Femur_alt: ImageVector? = null

