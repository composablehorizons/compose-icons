package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.AdjustmentsHorizontal: ImageVector
    get() {
        if (_AdjustmentsHorizontal != null) return _AdjustmentsHorizontal!!
        
        _AdjustmentsHorizontal = ImageVector.Builder(
            name = "adjustments-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(11f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(11f)
                verticalLineTo(6.5f)
                close()
                moveTo(5.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(2.75f, 7.25f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                close()
                moveTo(4f, 3f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                close()
                moveTo(2.75f, 11.5f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                close()
            }
        }.build()
        
        return _AdjustmentsHorizontal!!
    }

private var _AdjustmentsHorizontal: ImageVector? = null

