package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_activity_zone: ImageVector
    get() {
        if (_Auto_activity_zone != null) return _Auto_activity_zone!!
        
        _Auto_activity_zone = ImageVector.Builder(
            name = "auto_activity_zone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 22f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(2f, 19f)
                quadToRelative(0f, -0.975f, 0.562f, -1.738f)
                quadTo(3.125f, 16.5f, 4f, 16.175f)
                verticalLineToRelative(-8.35f)
                quadTo(3.125f, 7.5f, 2.562f, 6.737f)
                quadTo(2f, 5.975f, 2f, 5f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(5f, 2f)
                quadToRelative(0.975f, 0f, 1.738f, 0.562f)
                quadTo(7.5f, 3.125f, 7.825f, 4f)
                horizontalLineToRelative(8.35f)
                quadToRelative(0.3f, -0.875f, 1.063f, -1.438f)
                quadTo(18f, 2f, 19f, 2f)
                quadToRelative(1.25f, 0f, 2.125f, 0.875f)
                reflectiveQuadTo(22f, 5f)
                quadToRelative(0f, 1f, -0.562f, 1.762f)
                quadToRelative(-0.563f, 0.763f, -1.438f, 1.063f)
                verticalLineToRelative(8.35f)
                quadToRelative(0.875f, 0.325f, 1.438f, 1.087f)
                quadTo(22f, 18.025f, 22f, 19f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(19f, 22f)
                quadToRelative(-0.975f, 0f, -1.737f, -0.562f)
                quadToRelative(-0.763f, -0.563f, -1.088f, -1.438f)
                horizontalLineToRelative(-8.35f)
                quadToRelative(-0.325f, 0.875f, -1.087f, 1.438f)
                quadTo(5.975f, 22f, 5f, 22f)
                close()
                moveToRelative(2.825f, -4f)
                horizontalLineToRelative(8.35f)
                quadToRelative(0.225f, -0.65f, 0.7f, -1.125f)
                reflectiveQuadToRelative(1.125f, -0.7f)
                verticalLineToRelative(-8.35f)
                quadToRelative(-0.65f, -0.225f, -1.125f, -0.7f)
                reflectiveQuadTo(16.175f, 6f)
                horizontalLineToRelative(-8.35f)
                quadToRelative(-0.225f, 0.65f, -0.7f, 1.125f)
                reflectiveQuadTo(6f, 7.825f)
                verticalLineToRelative(8.35f)
                quadToRelative(0.65f, 0.225f, 1.125f, 0.7f)
                reflectiveQuadToRelative(0.7f, 1.125f)
                close()
                moveTo(12f, 16f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(8f, 12f)
                lineToRelative(2.75f, -1.25f)
                lineTo(12f, 8f)
                lineToRelative(1.25f, 2.75f)
                lineTo(16f, 12f)
                lineToRelative(-2.75f, 1.25f)
                close()
            }
        }.build()
        
        return _Auto_activity_zone!!
    }

private var _Auto_activity_zone: ImageVector? = null

