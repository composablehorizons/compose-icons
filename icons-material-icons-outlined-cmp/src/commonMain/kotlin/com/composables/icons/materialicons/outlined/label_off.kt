package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Label_off: ImageVector
    get() {
        if (_Label_off != null) return _Label_off!!
        
        _Label_off = ImageVector.Builder(
            name = "label_off",
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
                moveTo(16f, 7f)
                lineToRelative(3.55f, 5f)
                lineToRelative(-1.63f, 2.29f)
                lineToRelative(1.43f, 1.43f)
                lineTo(22f, 12f)
                lineToRelative(-4.37f, -6.16f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                lineToRelative(-7.37f, 0.01f)
                lineToRelative(2f, 1.99f)
                horizontalLineTo(16f)
                close()
                moveTo(2f, 4.03f)
                lineToRelative(1.58f, 1.58f)
                curveTo(3.22f, 5.96f, 3f, 6.46f, 3f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 1.99f, 2f, 1.99f)
                lineTo(16f, 19f)
                curveToRelative(0.28f, 0f, 0.55f, -0.07f, 0.79f, -0.18f)
                lineTo(18.97f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 2.62f)
                lineTo(2f, 4.03f)
                close()
                moveTo(14.97f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7.03f)
                lineTo(14.97f, 17f)
                close()
            }
        }.build()
        
        return _Label_off!!
    }

private var _Label_off: ImageVector? = null

