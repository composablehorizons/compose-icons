package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Restore_page: ImageVector
    get() {
        if (_Restore_page != null) return _Restore_page!!
        
        _Restore_page = ImageVector.Builder(
            name = "restore_page",
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
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(4f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                lineToRelative(-6f, -6f)
                close()
                moveToRelative(4f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(7.17f)
                lineTo(18f, 8.83f)
                verticalLineTo(20f)
                close()
                moveToRelative(-9.55f, -9.43f)
                lineTo(7.28f, 9.4f)
                verticalLineTo(13f)
                horizontalLineToRelative(3.6f)
                lineToRelative(-1.44f, -1.44f)
                curveToRelative(0.52f, -1.01f, 1.58f, -1.71f, 2.79f, -1.71f)
                curveToRelative(1.74f, 0f, 3.15f, 1.41f, 3.15f, 3.15f)
                reflectiveCurveToRelative(-1.41f, 3.15f, -3.15f, 3.15f)
                curveToRelative(-1.07f, 0f, -2.02f, -0.54f, -2.58f, -1.35f)
                horizontalLineTo(8.1f)
                curveToRelative(0.69f, 1.58f, 2.28f, 2.7f, 4.12f, 2.7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.59f, 0f, -2.97f, 0.83f, -3.77f, 2.07f)
                close()
            }
        }.build()
        
        return _Restore_page!!
    }

private var _Restore_page: ImageVector? = null

