package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.RCircle: ImageVector
    get() {
        if (_RCircle != null) return _RCircle!!
        
        _RCircle = ImageVector.Builder(
            name = "r-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.5f, 4.002f)
                horizontalLineToRelative(3.11f)
                curveToRelative(1.71f, 0f, 2.741f, 0.973f, 2.741f, 2.46f)
                curveToRelative(0f, 1.138f, -0.667f, 1.94f, -1.495f, 2.24f)
                lineTo(11.5f, 12f)
                horizontalLineTo(9.98f)
                lineTo(8.52f, 8.924f)
                horizontalLineTo(6.836f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                close()
                moveToRelative(1.335f, 1.09f)
                verticalLineToRelative(2.777f)
                horizontalLineToRelative(1.549f)
                curveToRelative(0.995f, 0f, 1.573f, -0.463f, 1.573f, -1.36f)
                curveToRelative(0f, -0.913f, -0.596f, -1.417f, -1.537f, -1.417f)
                close()
            }
        }.build()
        
        return _RCircle!!
    }

private var _RCircle: ImageVector? = null

