package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Detector_smoke: ImageVector
    get() {
        if (_Detector_smoke != null) return _Detector_smoke!!
        
        _Detector_smoke = ImageVector.Builder(
            name = "detector_smoke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(324f, 320f)
                lineToRelative(12f, 40f)
                horizontalLineToRelative(288f)
                lineToRelative(12f, -40f)
                horizontalLineTo(324f)
                close()
                moveToRelative(12f, 120f)
                quadToRelative(-26f, 0f, -47f, -15.5f)
                reflectiveQuadTo(260f, 384f)
                lineToRelative(-20f, -64f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 240f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, 68f)
                quadToRelative(-9f, 23f, -29f, 37.5f)
                reflectiveQuadTo(620f, 440f)
                horizontalLineTo(336f)
                close()
                moveTo(520f, 892f)
                lineToRelative(-76f, -24f)
                lineToRelative(16f, -52f)
                quadToRelative(6f, -24f, 4f, -46.5f)
                reflectiveQuadTo(448f, 724f)
                quadToRelative(-25f, -38f, -31.5f, -78.5f)
                reflectiveQuadTo(424f, 560f)
                lineToRelative(16f, -52f)
                lineToRelative(76f, 24f)
                lineToRelative(-16f, 52f)
                quadToRelative(-8f, 23f, -5f, 47.5f)
                reflectiveQuadToRelative(17f, 44.5f)
                quadToRelative(23f, 38f, 30.5f, 80f)
                reflectiveQuadToRelative(-6.5f, 84f)
                lineToRelative(-16f, 52f)
                close()
                moveToRelative(-176f, 0f)
                lineToRelative(-76f, -24f)
                lineToRelative(16f, -52f)
                quadToRelative(6f, -23f, 4f, -47f)
                reflectiveQuadToRelative(-16f, -45f)
                quadToRelative(-26f, -37f, -32f, -79f)
                reflectiveQuadToRelative(8f, -85f)
                lineToRelative(16f, -52f)
                lineToRelative(76f, 24f)
                lineToRelative(-16f, 52f)
                quadToRelative(-8f, 23f, -5f, 48f)
                reflectiveQuadToRelative(17f, 44f)
                quadToRelative(24f, 36f, 31f, 79.5f)
                reflectiveQuadToRelative(-7f, 84.5f)
                lineToRelative(-16f, 52f)
                close()
                moveToRelative(348f, 0f)
                lineToRelative(-76f, -24f)
                lineToRelative(16f, -52f)
                quadToRelative(6f, -23f, 4f, -47f)
                reflectiveQuadToRelative(-16f, -45f)
                quadToRelative(-26f, -37f, -32f, -79f)
                reflectiveQuadToRelative(8f, -85f)
                lineToRelative(16f, -52f)
                lineToRelative(76f, 24f)
                lineToRelative(-16f, 52f)
                quadToRelative(-8f, 24f, -5f, 47.5f)
                reflectiveQuadToRelative(17f, 44.5f)
                quadToRelative(24f, 38f, 30.5f, 80f)
                reflectiveQuadToRelative(-6.5f, 84f)
                lineToRelative(-16f, 52f)
                close()
            }
        }.build()
        
        return _Detector_smoke!!
    }

private var _Detector_smoke: ImageVector? = null

