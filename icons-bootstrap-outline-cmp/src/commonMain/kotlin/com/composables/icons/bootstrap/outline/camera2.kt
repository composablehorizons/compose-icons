package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Camera2: ImageVector
    get() {
        if (_Camera2 != null) return _Camera2!!
        
        _Camera2 = ImageVector.Builder(
            name = "camera2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8f)
                curveToRelative(0f, -1.657f, 2.343f, -3f, 4f, -3f)
                verticalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.318f, 3f)
                horizontalLineToRelative(2.015f)
                curveTo(15.253f, 3f, 16f, 3.746f, 16f, 4.667f)
                verticalLineToRelative(6.666f)
                curveToRelative(0f, 0.92f, -0.746f, 1.667f, -1.667f, 1.667f)
                horizontalLineToRelative(-2.015f)
                arcTo(5.97f, 5.97f, 0f, false, true, 9f, 14f)
                arcToRelative(5.97f, 5.97f, 0f, false, true, -3.318f, -1f)
                horizontalLineTo(1.667f)
                curveTo(0.747f, 13f, 0f, 12.254f, 0f, 11.333f)
                verticalLineTo(4.667f)
                curveTo(0f, 3.747f, 0.746f, 3f, 1.667f, 3f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                horizontalLineToRelative(0.682f)
                arcTo(5.97f, 5.97f, 0f, false, true, 9f, 2f)
                curveToRelative(1.227f, 0f, 2.367f, 0.368f, 3.318f, 1f)
                moveTo(2f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                moveTo(14f, 8f)
                arcTo(5f, 5f, 0f, true, false, 4f, 8f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
            }
        }.build()
        
        return _Camera2!!
    }

private var _Camera2: ImageVector? = null

