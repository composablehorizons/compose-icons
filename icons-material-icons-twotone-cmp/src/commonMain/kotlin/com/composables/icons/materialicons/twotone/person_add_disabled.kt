package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_add_disabled: ImageVector
    get() {
        if (_Person_add_disabled != null) return _Person_add_disabled!!
        
        _Person_add_disabled = ImageVector.Builder(
            name = "person_add_disabled",
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
                moveTo(9f, 18f)
                horizontalLineToRelative(5.87f)
                lineTo(13f, 16.13f)
                lineToRelative(-1.1f, 0.3f)
                curveTo(9.89f, 16.99f, 9.08f, 17.76f, 9f, 18f)
                close()
                moveToRelative(8f, -10f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-0.99f, 0f, -1.81f, 0.72f, -1.97f, 1.67f)
                lineToRelative(2.31f, 2.31f)
                curveTo(16.27f, 9.82f, 17f, 8.99f, 17f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.48f, 11.95f)
                curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f)
                lineToRelative(3.43f, 3.43f)
                close()
                moveTo(15f, 6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.99f, -0.73f, 1.82f, -1.67f, 1.97f)
                lineToRelative(-2.31f, -2.31f)
                curveTo(13.19f, 6.72f, 14.01f, 6f, 15f, 6f)
                close()
                moveToRelative(1.69f, 8.16f)
                lineTo(22.53f, 20f)
                horizontalLineTo(23f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f)
                close()
                moveTo(0f, 3.12f)
                lineToRelative(4f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.88f)
                lineToRelative(2.51f, 2.51f)
                curveTo(9.19f, 15.11f, 7f, 16.3f, 7f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.88f)
                lineToRelative(4f, 4f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.71f)
                lineTo(0f, 3.12f)
                close()
                moveToRelative(13.01f, 13.01f)
                lineTo(14.88f, 18f)
                horizontalLineTo(9f)
                curveToRelative(0.08f, -0.24f, 0.88f, -1.01f, 2.91f, -1.57f)
                lineToRelative(1.1f, -0.3f)
                close()
                moveTo(6f, 9.12f)
                lineToRelative(0.88f, 0.88f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.88f)
                close()
            }
        }.build()
        
        return _Person_add_disabled!!
    }

private var _Person_add_disabled: ImageVector? = null

