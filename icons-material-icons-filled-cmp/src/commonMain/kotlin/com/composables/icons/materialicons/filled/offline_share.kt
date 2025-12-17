package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Offline_share: ImageVector
    get() {
        if (_Offline_share != null) return _Offline_share!!
        
        _Offline_share = ImageVector.Builder(
            name = "offline_share",
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
                moveTo(14.6f, 10.26f)
                verticalLineToRelative(1.31f)
                lineTo(17f, 9.33f)
                lineTo(14.6f, 7.1f)
                verticalLineToRelative(1.28f)
                curveToRelative(-2.33f, 0.32f, -3.26f, 1.92f, -3.6f, 3.52f)
                curveToRelative(0.83f, -1.13f, 1.93f, -1.64f, 3.6f, -1.64f)
                close()
                moveTo(16f, 23f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, -22f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineTo(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

