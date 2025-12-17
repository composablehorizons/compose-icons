package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Smoking: ImageVector
    get() {
        if (_Smoking != null) return _Smoking!!
        
        _Smoking = ImageVector.Builder(
            name = "smoking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(632f, 352f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(360f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
                moveTo(553.3f, 87.1f)
                curveToRelative(-5.7f, -3.8f, -9.3f, -10f, -9.3f, -16.8f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(62.3f)
                curveToRelative(0f, 22f, 10.2f, 43.4f, 28.6f, 55.4f)
                curveToRelative(42.2f, 27.3f, 67.4f, 73.8f, 67.4f, 124f)
                verticalLineTo(280f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-30.3f)
                curveToRelative(0f, -65.5f, -32.4f, -126.2f, -86.7f, -162.6f)
                close()
                moveTo(432f, 352f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(384f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(368f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-32f, 112f)
                horizontalLineTo(224f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(87.7f, -322.4f)
                curveTo(463.8f, 125f, 448f, 99.3f, 448f, 70.3f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(66.4f)
                curveToRelative(0f, 43.7f, 24.6f, 81.6f, 60.3f, 106.7f)
                curveToRelative(22.4f, 15.7f, 35.7f, 41.2f, 35.7f, 68.6f)
                verticalLineTo(280f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-30.3f)
                curveToRelative(0f, -43.3f, -21f, -83.4f, -56.3f, -108.1f)
                close()
                moveTo(536f, 352f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(360f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
            }
        }.build()
        
        return _Smoking!!
    }

private var _Smoking: ImageVector? = null

