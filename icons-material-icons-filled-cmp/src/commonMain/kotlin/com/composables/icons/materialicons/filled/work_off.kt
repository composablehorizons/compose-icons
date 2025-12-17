package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Work_off: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 21.74f)
                lineToRelative(-1.46f, -1.46f)
                lineTo(7.21f, 5.95f)
                lineTo(3.25f, 1.99f)
                lineTo(1.99f, 3.25f)
                lineToRelative(2.7f, 2.7f)
                horizontalLineToRelative(-0.64f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                lineToRelative(-0.01f, 11f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(15.64f)
                lineTo(21.74f, 23f)
                lineTo(23f, 21.74f)
                close()
                moveTo(22f, 7.95f)
                curveToRelative(0.05f, -1.11f, -0.84f, -2f, -1.95f, -1.95f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3.95f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -1.95f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.11f, -0.05f, -2f, 0.84f, -2f, 1.95f)
                verticalLineToRelative(0.32f)
                lineToRelative(13.95f, 14f)
                verticalLineTo(7.95f)
                close()
                moveTo(14.05f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(3.95f)
                horizontalLineToRelative(4.05f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Work_off!!
    }

private var _Work_off: ImageVector? = null

