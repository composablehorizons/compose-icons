package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Unarchive: ImageVector
    get() {
        if (_Unarchive != null) return _Unarchive!!
        
        _Unarchive = ImageVector.Builder(
            name = "unarchive",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(7f, -9f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-2.55f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                lineToRelative(4f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.54f, 5.23f)
                lineToRelative(-1.39f, -1.68f)
                curveTo(18.88f, 3.21f, 18.47f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveToRelative(-0.47f, 0f, -0.88f, 0.21f, -1.16f, 0.55f)
                lineTo(3.46f, 5.23f)
                curveTo(3.17f, 5.57f, 3f, 6.02f, 3f, 6.5f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f)
                close()
                moveTo(6.24f, 5f)
                horizontalLineToRelative(11.52f)
                lineToRelative(0.83f, 1f)
                horizontalLineTo(5.42f)
                lineToRelative(0.82f, -1f)
                close()
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(-8.45f, -2f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(-3f)
                horizontalLineTo(16f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(2.55f)
                close()
            }
        }.build()
        
        return _Unarchive!!
    }

private var _Unarchive: ImageVector? = null

