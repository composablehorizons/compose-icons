package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_sim: ImageVector
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
                moveTo(18.99f, 5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -1.99f, -2f)
                horizontalLineToRelative(-7f)
                lineTo(7.66f, 5.34f)
                lineTo(19f, 16.68f)
                lineTo(18.99f, 5f)
                close()
                moveTo(3.65f, 3.88f)
                lineTo(2.38f, 5.15f)
                lineTo(5f, 7.77f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10.01f)
                curveToRelative(0.35f, 0f, 0.67f, -0.1f, 0.96f, -0.26f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.65f, 3.88f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

