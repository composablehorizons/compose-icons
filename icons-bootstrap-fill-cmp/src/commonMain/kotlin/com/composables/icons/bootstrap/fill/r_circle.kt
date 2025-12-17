package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.RCircle: ImageVector
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.5f, 4.002f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.335f)
                verticalLineTo(8.924f)
                horizontalLineTo(8.52f)
                lineTo(9.98f, 12f)
                horizontalLineToRelative(1.52f)
                lineTo(9.856f, 8.701f)
                curveToRelative(0.828f, -0.299f, 1.495f, -1.101f, 1.495f, -2.238f)
                curveToRelative(0f, -1.488f, -1.03f, -2.461f, -2.74f, -2.461f)
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

