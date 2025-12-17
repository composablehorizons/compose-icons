package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 12.5f)
                lineTo(4.75f, 9f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-3.5f)
                lineTo(7.3f, 15f)
                horizontalLineToRelative(1.2f)
                verticalLineTo(9f)
                horizontalLineTo(7.25f)
                close()
                moveTo(9.5f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(11f)
                verticalLineToRelative(-1.11f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.26f)
                horizontalLineTo(11f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(9.75f, -6f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.12f)
                verticalLineTo(9.99f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(-1.13f)
                verticalLineTo(9f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(9f)
                horizontalLineToRelative(-1.25f)
                close()
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

