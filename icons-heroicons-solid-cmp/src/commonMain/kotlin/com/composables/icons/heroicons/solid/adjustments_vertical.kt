package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.AdjustmentsVertical: ImageVector
    get() {
        if (_AdjustmentsVertical != null) return _AdjustmentsVertical!!
        
        _AdjustmentsVertical = ImageVector.Builder(
            name = "adjustments-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.5f, 0f)
                verticalLineToRelative(7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 12f)
                close()
                moveTo(18f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 12f)
                close()
                moveTo(6.75f, 20.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
                moveTo(18.75f, 18.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveTo(12.75f, 5.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 21f)
                close()
                moveTo(3.75f, 15f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -4.5f, 0f)
                close()
                moveTo(12f, 11.25f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 0f, 4.5f)
                close()
                moveTo(15.75f, 15f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -4.5f, 0f)
                close()
            }
        }.build()
        
        return _AdjustmentsVertical!!
    }

private var _AdjustmentsVertical: ImageVector? = null

