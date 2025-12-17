package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.AdjustmentsVertical: ImageVector
    get() {
        if (_AdjustmentsVertical != null) return _AdjustmentsVertical!!
        
        _AdjustmentsVertical = ImageVector.Builder(
            name = "adjustments-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 13.25f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                close()
                moveTo(8.75f, 2.75f)
                verticalLineTo(5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveTo(2.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-0.75f)
                close()
                moveTo(10f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                close()
                moveTo(11.5f, 13.25f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                close()
            }
        }.build()
        
        return _AdjustmentsVertical!!
    }

private var _AdjustmentsVertical: ImageVector? = null

