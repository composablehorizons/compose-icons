package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cabin: ImageVector
    get() {
        if (_Cabin != null) return _Cabin!!
        
        _Cabin = ImageVector.Builder(
            name = "cabin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                curveTo(6.45f, 4f, 6f, 4.45f, 6f, 5f)
                horizontalLineTo(4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineTo(10f)
                close()
                moveTo(12f, 3f)
                lineTo(6f, 7.58f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(3.11f)
                lineTo(1f, 11.4f)
                lineToRelative(1.21f, 1.59f)
                lineTo(4f, 11.62f)
                verticalLineTo(21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.79f, 1.36f)
                lineTo(23f, 11.4f)
                lineTo(12f, 3f)
                close()
                moveTo(13.94f, 7f)
                horizontalLineToRelative(-3.89f)
                lineTo(12f, 5.52f)
                lineTo(13.94f, 7f)
                close()
                moveTo(7.44f, 9f)
                horizontalLineToRelative(9.12f)
                lineTo(18f, 10.1f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.9f)
                lineTo(7.44f, 9f)
                close()
                moveTo(18f, 13f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(18f)
                close()
                moveTo(6f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Cabin!!
    }

private var _Cabin: ImageVector? = null

