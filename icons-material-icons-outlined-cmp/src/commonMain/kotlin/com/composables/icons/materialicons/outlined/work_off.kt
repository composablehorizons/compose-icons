package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Work_off: ImageVector
    get() {
        if (_Work_off != null) return _Work_off!!
        
        _Work_off = ImageVector.Builder(
            name = "work_off",
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
                moveTo(10f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(7.6f)
                lineToRelative(2f, 2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.99f, 0f, -1.8f, 0.7f, -1.96f, 1.64f)
                lineTo(10f, 5.6f)
                verticalLineTo(4f)
                close()
                moveTo(3.4f, 1.84f)
                lineTo(1.99f, 3.25f)
                lineTo(4.74f, 6f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                lineTo(2f, 19f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(15.74f)
                lineToRelative(2f, 2f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.4f, 1.84f)
                close()
                moveTo(4f, 19f)
                verticalLineTo(8f)
                horizontalLineToRelative(2.74f)
                lineToRelative(11f, 11f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Work_off!!
    }

private var _Work_off: ImageVector? = null

