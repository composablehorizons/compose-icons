package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_cam_outdoor: ImageVector
    get() {
        if (_Nest_cam_outdoor != null) return _Nest_cam_outdoor!!
        
        _Nest_cam_outdoor = ImageVector.Builder(
            name = "nest_cam_outdoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 771f)
                quadToRelative(-22f, 26f, -54.5f, 29.5f)
                reflectiveQuadTo(463f, 782f)
                lineTo(294f, 641f)
                quadToRelative(-26f, -21f, -45f, -48f)
                reflectiveQuadToRelative(-31f, -58f)
                quadToRelative(-11f, 12f, -26f, 18.5f)
                reflectiveQuadToRelative(-32f, 6.5f)
                horizontalLineTo(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                quadToRelative(29f, 0f, 51.5f, 18f)
                reflectiveQuadToRelative(27.5f, 47f)
                quadToRelative(38f, -58f, 98f, -91.5f)
                reflectiveQuadTo(466f, 180f)
                quadToRelative(45f, 0f, 85.5f, 16f)
                reflectiveQuadToRelative(74.5f, 45f)
                lineToRelative(170f, 141f)
                quadToRelative(26f, 21f, 28.5f, 53.5f)
                reflectiveQuadTo(806f, 494f)
                lineTo(576f, 771f)
                close()
            }
        }.build()
        
        return _Nest_cam_outdoor!!
    }

private var _Nest_cam_outdoor: ImageVector? = null

