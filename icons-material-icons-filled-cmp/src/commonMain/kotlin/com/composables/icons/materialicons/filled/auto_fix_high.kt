package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Auto_fix_high: ImageVector
    get() {
        if (_Auto_fix_high != null) return _Auto_fix_high!!
        
        _Auto_fix_high = ImageVector.Builder(
            name = "auto_fix_high",
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
                moveTo(7.5f, 5.6f)
                lineTo(10f, 7f)
                lineTo(8.6f, 4.5f)
                lineTo(10f, 2f)
                lineTo(7.5f, 3.4f)
                lineTo(5f, 2f)
                lineToRelative(1.4f, 2.5f)
                lineTo(5f, 7f)
                close()
                moveToRelative(12f, 9.8f)
                lineTo(17f, 14f)
                lineToRelative(1.4f, 2.5f)
                lineTo(17f, 19f)
                lineToRelative(2.5f, -1.4f)
                lineTo(22f, 19f)
                lineToRelative(-1.4f, -2.5f)
                lineTo(22f, 14f)
                close()
                moveTo(22f, 2f)
                lineToRelative(-2.5f, 1.4f)
                lineTo(17f, 2f)
                lineToRelative(1.4f, 2.5f)
                lineTo(17f, 7f)
                lineToRelative(2.5f, -1.4f)
                lineTo(22f, 7f)
                lineToRelative(-1.4f, -2.5f)
                close()
                moveToRelative(-7.63f, 5.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(1.29f, 18.96f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(16.7f, 11.05f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.33f, -2.35f)
                close()
                moveToRelative(-1.03f, 5.49f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                close()
            }
        }.build()
        
        return _Auto_fix_high!!
    }

private var _Auto_fix_high: ImageVector? = null

