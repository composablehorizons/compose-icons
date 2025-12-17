package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Coverage: ImageVector
    get() {
        if (_Coverage != null) return _Coverage!!
        
        _Coverage = ImageVector.Builder(
            name = "coverage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 5f)
                curveTo(8.981f, 5f, 11f, 7.019f, 11f, 9.5f)
                curveTo(11f, 11.981f, 8.981f, 14f, 6.5f, 14f)
                curveTo(4.019f, 14f, 2f, 11.981f, 2f, 9.5f)
                curveTo(2f, 7.019f, 4.019f, 5f, 6.5f, 5f)
                close()
                moveTo(6.5f, 4f)
                curveTo(3.462f, 4f, 1f, 6.462f, 1f, 9.5f)
                curveTo(1f, 12.538f, 3.462f, 15f, 6.5f, 15f)
                curveTo(9.538f, 15f, 12f, 12.538f, 12f, 9.5f)
                curveTo(12f, 6.462f, 9.538f, 4f, 6.5f, 4f)
                close()
                moveTo(9.5f, 1f)
                curveTo(7.73f, 1f, 6.16f, 1.84f, 5.16f, 3.14f)
                curveTo(5.59f, 3.05f, 6.04f, 3f, 6.5f, 3f)
                curveTo(6.56f, 3f, 6.62f, 3f, 6.67f, 3.01f)
                curveTo(7.45f, 2.37f, 8.43f, 2f, 9.5f, 2f)
                curveTo(11.98f, 2f, 14f, 4.02f, 14f, 6.5f)
                curveTo(14f, 7.57f, 13.63f, 8.55f, 12.99f, 9.33f)
                curveTo(13f, 9.38f, 13f, 9.44f, 13f, 9.5f)
                curveTo(13f, 9.96f, 12.95f, 10.41f, 12.86f, 10.84f)
                curveTo(14.16f, 9.84f, 15f, 8.27f, 15f, 6.5f)
                curveTo(15f, 3.47f, 12.53f, 1f, 9.5f, 1f)
                close()
                moveTo(5.604f, 11.604f)
                lineTo(9.104f, 8.104f)
                curveTo(9.299f, 7.909f, 9.299f, 7.592f, 9.104f, 7.397f)
                curveTo(8.909f, 7.202f, 8.592f, 7.202f, 8.397f, 7.397f)
                lineTo(5.251f, 10.543f)
                lineTo(4.355f, 9.647f)
                curveTo(4.16f, 9.452f, 3.843f, 9.452f, 3.648f, 9.647f)
                curveTo(3.453f, 9.842f, 3.453f, 10.159f, 3.648f, 10.354f)
                lineTo(4.898f, 11.604f)
                curveTo(4.996f, 11.702f, 5.124f, 11.75f, 5.252f, 11.75f)
                curveTo(5.38f, 11.75f, 5.508f, 11.701f, 5.606f, 11.604f)
                horizontalLineTo(5.604f)
                close()
            }
        }.build()
        
        return _Coverage!!
    }

private var _Coverage: ImageVector? = null

