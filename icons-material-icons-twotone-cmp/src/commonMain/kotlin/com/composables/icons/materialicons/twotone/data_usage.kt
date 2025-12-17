package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Data_usage: ImageVector
    get() {
        if (_Data_usage != null) return _Data_usage!!
        
        _Data_usage = ImageVector.Builder(
            name = "data_usage",
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
                moveTo(13f, 2.05f)
                verticalLineToRelative(3.03f)
                curveToRelative(3.39f, 0.49f, 6f, 3.39f, 6f, 6.92f)
                curveToRelative(0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f)
                lineToRelative(2.6f, 1.53f)
                curveToRelative(0.56f, -1.24f, 0.88f, -2.62f, 0.88f, -4.07f)
                curveToRelative(0f, -5.18f, -3.95f, -9.45f, -9f, -9.95f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -3.53f, 2.61f, -6.43f, 6f, -6.92f)
                verticalLineTo(2.05f)
                curveToRelative(-5.06f, 0.5f, -9f, 4.76f, -9f, 9.95f)
                curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                curveToRelative(3.31f, 0f, 6.24f, -1.61f, 8.06f, -4.09f)
                lineToRelative(-2.6f, -1.53f)
                curveTo(16.17f, 17.98f, 14.21f, 19f, 12f, 19f)
                close()
            }
        }.build()
        
        return _Data_usage!!
    }

private var _Data_usage: ImageVector? = null

