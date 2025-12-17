package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_sim: ImageVector
    get() {
        if (_No_sim != null) return _No_sim!!
        
        _No_sim = ImageVector.Builder(
            name = "no_sim",
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
                moveTo(21.26f, 21.21f)
                lineTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(-0.12f, 0.12f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.35f, 0f, 0.68f, -0.1f, 0.97f, -0.26f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(7f, 19f)
                verticalLineTo(9.77f)
                lineTo(16.23f, 19f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3.84f, -14f)
                horizontalLineTo(17f)
                verticalLineToRelative(9.11f)
                lineToRelative(2f, 2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6.99f)
                lineTo(7.95f, 5.06f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.84f, 5f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

