package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ios_share: ImageVector
    get() {
        if (_Ios_share != null) return _Ios_share!!
        
        _Ios_share = ImageVector.Builder(
            name = "ios_share",
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
                moveTo(16f, 5f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(-1.59f, -1.59f)
                verticalLineTo(16f)
                horizontalLineToRelative(-1.98f)
                verticalLineTo(4.83f)
                lineTo(9.42f, 6.42f)
                lineTo(8f, 5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(4f, 5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(10f)
                curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(12f)
                verticalLineTo(10f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Ios_share!!
    }

private var _Ios_share: ImageVector? = null

