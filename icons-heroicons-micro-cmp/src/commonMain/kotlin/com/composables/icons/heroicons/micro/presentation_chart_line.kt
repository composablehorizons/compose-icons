package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PresentationChartLine: ImageVector
    get() {
        if (_PresentationChartLine != null) return _PresentationChartLine!!
        
        _PresentationChartLine = ImageVector.Builder(
            name = "presentation-chart-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(0.043f)
                lineToRelative(-1.005f, 3.013f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.423f, 0.474f)
                lineTo(4.624f, 14f)
                horizontalLineToRelative(6.752f)
                lineToRelative(0.163f, 0.487f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.423f, -0.474f)
                lineTo(11.957f, 11f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(1.75f)
                close()
                moveToRelative(8.626f, 9f)
                lineToRelative(0.5f, 1.5f)
                horizontalLineTo(5.124f)
                lineToRelative(0.5f, -1.5f)
                horizontalLineToRelative(4.752f)
                close()
                moveToRelative(1.317f, -5.833f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.892f, -1.206f)
                arcToRelative(8.789f, 8.789f, 0f, false, false, -2.465f, 2.814f)
                lineTo(7.28f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.47f, -1.47f)
                lineTo(8.028f, 8.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.228f, -0.255f)
                arcToRelative(7.275f, 7.275f, 0f, false, true, 2.437f, -3.167f)
                close()
            }
        }.build()
        
        return _PresentationChartLine!!
    }

private var _PresentationChartLine: ImageVector? = null

