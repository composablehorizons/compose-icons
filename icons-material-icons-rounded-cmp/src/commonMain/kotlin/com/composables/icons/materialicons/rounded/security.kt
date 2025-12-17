package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Security: ImageVector
    get() {
        if (_Security != null) return _Security!!
        
        _Security = ImageVector.Builder(
            name = "security",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.19f, 1.36f)
                lineToRelative(-7f, 3.11f)
                curveTo(3.47f, 4.79f, 3f, 5.51f, 3f, 6.3f)
                verticalLineTo(11f)
                curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                verticalLineTo(6.3f)
                curveToRelative(0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                lineToRelative(-7f, -3.11f)
                curveToRelative(-0.51f, -0.23f, -1.11f, -0.23f, -1.62f, 0f)
                close()
                moveTo(12f, 11.99f)
                horizontalLineToRelative(7f)
                curveToRelative(-0.53f, 4.12f, -3.28f, 7.79f, -7f, 8.94f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(6.3f)
                lineToRelative(7f, -3.11f)
                verticalLineToRelative(8.8f)
                close()
            }
        }.build()
        
        return _Security!!
    }

private var _Security: ImageVector? = null

