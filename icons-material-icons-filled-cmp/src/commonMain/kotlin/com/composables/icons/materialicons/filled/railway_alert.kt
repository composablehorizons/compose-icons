package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Railway_alert: ImageVector
    get() {
        if (_Railway_alert != null) return _Railway_alert!!
        
        _Railway_alert = ImageVector.Builder(
            name = "railway_alert",
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
                moveTo(23f, 8f)
                arcToRelative(7f, 7f, 0f, false, false, -11.95f, -4.95f)
                arcTo(33.8f, 33.8f, 0f, false, false, 9f, 3f)
                curveToRelative(-4.42f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10.5f)
                arcTo(3.5f, 3.5f, 0f, false, false, 4.5f, 21f)
                lineTo(3f, 22.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                lineTo(13.5f, 21f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-2.58f)
                arcTo(7f, 7f, 0f, false, false, 23f, 8f)
                close()
                moveTo(3f, 12f)
                verticalLineTo(7f)
                horizontalLineToRelative(6.08f)
                arcToRelative(6.96f, 6.96f, 0f, false, false, 1.18f, 5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(6f, 7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(7.71f, -6.06f)
                lineToRelative(-0.2f, 0.03f)
                lineTo(16f, 13f)
                lineToRelative(-0.47f, -0.02f)
                lineToRelative(-0.16f, -0.02f)
                lineToRelative(-0.29f, -0.04f)
                lineToRelative(-0.2f, -0.04f)
                lineToRelative(-0.22f, -0.06f)
                arcToRelative(1.55f, 1.55f, 0f, false, true, -0.23f, -0.07f)
                lineToRelative(-0.13f, -0.05f)
                arcTo(4.99f, 4.99f, 0f, false, true, 11.1f, 7f)
                curveToRelative(0.04f, -0.19f, 0.09f, -0.37f, 0.15f, -0.54f)
                lineToRelative(0.05f, -0.14f)
                lineToRelative(0.15f, -0.38f)
                lineToRelative(0.07f, -0.15f)
                lineToRelative(0.2f, -0.36f)
                lineToRelative(0.07f, -0.12f)
                lineToRelative(0.3f, -0.42f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.24f, -0.3f, 0.52f, -0.57f, 0.82f, -0.81f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.46f, -0.32f)
                lineToRelative(0.03f, -0.02f)
                arcTo(5.25f, 5.25f, 0f, false, true, 16f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 0.71f, 9.94f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Railway_alert!!
    }

private var _Railway_alert: ImageVector? = null

