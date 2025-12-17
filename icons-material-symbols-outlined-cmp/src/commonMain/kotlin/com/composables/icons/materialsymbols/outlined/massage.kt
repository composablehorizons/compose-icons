package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Massage: ImageVector
    get() {
        if (_Massage != null) return _Massage!!
        
        _Massage = ImageVector.Builder(
            name = "massage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(323f, 472f)
                lineToRelative(210f, 23f)
                lineToRelative(16f, -34f)
                lineToRelative(-61f, -33f)
                lineToRelative(-93f, -8f)
                lineToRelative(6f, -79f)
                lineToRelative(111f, 8f)
                lineToRelative(221f, 123f)
                quadToRelative(17f, 10f, 35.5f, 12.5f)
                reflectiveQuadTo(802f, 476f)
                lineTo(606f, 280f)
                horizontalLineTo(357f)
                lineToRelative(-65f, -96f)
                lineToRelative(-110f, 55f)
                lineToRelative(76f, 183f)
                quadToRelative(8f, 21f, 25.5f, 34f)
                reflectiveQuadToRelative(39.5f, 16f)
                close()
                moveToRelative(-9f, 79f)
                quadToRelative(-44f, -5f, -78.5f, -31f)
                reflectiveQuadTo(184f, 453f)
                lineTo(80f, 200f)
                lineToRelative(240f, -120f)
                lineToRelative(80f, 120f)
                horizontalLineToRelative(208f)
                quadToRelative(16f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(255f, 256f)
                lineToRelative(-34f, 34f)
                quadToRelative(-38f, 38f, -91f, 45.5f)
                reflectiveQuadTo(695f, 541f)
                lineToRelative(-76f, -41f)
                lineToRelative(-13f, 29f)
                quadToRelative(-11f, 23f, -33f, 35.5f)
                reflectiveQuadToRelative(-48f, 9.5f)
                lineToRelative(-211f, -23f)
                close()
                moveTo(130f, 839f)
                lineToRelative(-22f, -77f)
                lineToRelative(190f, -50f)
                quadToRelative(72f, -19f, 153f, -35.5f)
                reflectiveQuadTo(599f, 660f)
                quadToRelative(75f, 0f, 139.5f, 30f)
                reflectiveQuadTo(866f, 771f)
                lineToRelative(-54f, 59f)
                quadToRelative(-51f, -43f, -105.5f, -66.5f)
                reflectiveQuadTo(599f, 740f)
                quadToRelative(-64f, 0f, -141f, 16.5f)
                reflectiveQuadTo(319f, 789f)
                lineToRelative(-189f, 50f)
                close()
            }
        }.build()
        
        return _Massage!!
    }

private var _Massage: ImageVector? = null

