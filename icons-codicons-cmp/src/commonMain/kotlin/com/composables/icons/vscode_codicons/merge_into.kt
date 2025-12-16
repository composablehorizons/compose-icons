package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MergeInto: ImageVector
    get() {
        if (_MergeInto != null) return _MergeInto!!
        
        _MergeInto = ImageVector.Builder(
            name = "merge-into",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 13.5f)
                curveTo(13f, 13.776f, 12.776f, 14f, 12.5f, 14f)
                curveTo(9.46198f, 14f, 6.99998f, 11.538f, 6.99998f, 8.50001f)
                verticalLineTo(3.70701f)
                lineTo(4.35398f, 6.35301f)
                curveTo(4.15898f, 6.54801f, 3.84198f, 6.54801f, 3.64698f, 6.35301f)
                curveTo(3.45198f, 6.15801f, 3.45198f, 5.84101f, 3.64698f, 5.64601f)
                lineTo(7.14698f, 2.14601f)
                curveTo(7.34198f, 1.95101f, 7.65898f, 1.95101f, 7.85398f, 2.14601f)
                lineTo(11.354f, 5.64601f)
                curveTo(11.549f, 5.84101f, 11.549f, 6.15801f, 11.354f, 6.35301f)
                curveTo(11.159f, 6.54801f, 10.842f, 6.54801f, 10.647f, 6.35301f)
                lineTo(8.00098f, 3.70701f)
                verticalLineTo(8.50001f)
                curveTo(8.00098f, 10.985f, 10.016f, 13f, 12.501f, 13f)
                curveTo(12.777f, 13f, 13.001f, 13.224f, 13.001f, 13.5f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _MergeInto!!
    }

private var _MergeInto: ImageVector? = null

