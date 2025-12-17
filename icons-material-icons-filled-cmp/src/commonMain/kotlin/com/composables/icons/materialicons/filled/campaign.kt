package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Campaign: ImageVector
    get() {
        if (_Campaign != null) return _Campaign!!
        
        _Campaign = ImageVector.Builder(
            name = "campaign",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-2f, 6.61f)
                curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f)
                curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f)
                curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f)
                curveToRelative(-0.4f, 0.54f, -0.8f, 1.08f, -1.2f, 1.61f)
                close()
                moveTo(20.4f, 5.6f)
                curveToRelative(-0.4f, -0.53f, -0.8f, -1.07f, -1.2f, -1.6f)
                curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f)
                curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f)
                curveToRelative(0.96f, -0.72f, 2.21f, -1.65f, 3.2f, -2.4f)
                close()
                moveTo(4f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                lineToRelative(5f, 3f)
                verticalLineTo(6f)
                lineTo(8f, 9f)
                horizontalLineTo(4f)
                close()
                moveToRelative(11.5f, 3f)
                curveToRelative(0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f)
                verticalLineToRelative(6.69f)
                curveToRelative(0.92f, -0.81f, 1.5f, -2.01f, 1.5f, -3.34f)
                close()
            }
        }.build()
        
        return _Campaign!!
    }

private var _Campaign: ImageVector? = null

