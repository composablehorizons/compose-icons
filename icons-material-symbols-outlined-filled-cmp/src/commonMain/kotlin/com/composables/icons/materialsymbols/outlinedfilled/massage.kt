package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Massage: ImageVector
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
                moveTo(314f, 551f)
                quadToRelative(-44f, -5f, -78.5f, -31f)
                reflectiveQuadTo(184f, 453f)
                lineTo(80f, 200f)
                lineToRelative(240f, -120f)
                lineToRelative(80f, 120f)
                horizontalLineToRelative(208f)
                quadToRelative(16f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(255f, 256f)
                lineToRelative(-51f, 36f)
                quadToRelative(-20f, 14f, -45f, 13.5f)
                reflectiveQuadTo(777f, 517f)
                lineTo(510f, 368f)
                lineToRelative(-110f, -8f)
                lineToRelative(-4f, 60f)
                lineToRelative(96f, 7f)
                lineToRelative(87f, 50f)
                quadToRelative(19f, 10f, 23.5f, 27.5f)
                reflectiveQuadTo(601f, 539f)
                quadToRelative(-6f, 17f, -22.5f, 28f)
                reflectiveQuadToRelative(-40.5f, 9f)
                lineToRelative(-224f, -25f)
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

