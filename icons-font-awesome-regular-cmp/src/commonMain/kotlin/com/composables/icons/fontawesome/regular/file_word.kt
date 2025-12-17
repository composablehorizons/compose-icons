package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileWord: ImageVector
    get() {
        if (_FileWord != null) return _FileWord!!
        
        _FileWord = ImageVector.Builder(
            name = "file-word",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369.9f, 97.9f)
                lineTo(286f, 14f)
                curveTo(277f, 5f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(131.9f)
                curveToRelative(0f, -12.7f, -5.1f, -25f, -14.1f, -34f)
                close()
                moveTo(332.1f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(220.1f, -208f)
                curveToRelative(-5.7f, 0f, -10.6f, 4f, -11.7f, 9.5f)
                curveToRelative(-20.6f, 97.7f, -20.4f, 95.4f, -21f, 103.5f)
                curveToRelative(-0.2f, -1.2f, -0.4f, -2.6f, -0.7f, -4.3f)
                curveToRelative(-0.8f, -5.1f, 0.3f, 0.2f, -23.6f, -99.5f)
                curveToRelative(-1.3f, -5.4f, -6.1f, -9.2f, -11.7f, -9.2f)
                horizontalLineToRelative(-13.3f)
                curveToRelative(-5.5f, 0f, -10.3f, 3.8f, -11.7f, 9.1f)
                curveToRelative(-24.4f, 99f, -24f, 96.2f, -24.8f, 103.7f)
                curveToRelative(-0.1f, -1.1f, -0.2f, -2.5f, -0.5f, -4.2f)
                curveToRelative(-0.7f, -5.2f, -14.1f, -73.3f, -19.1f, -99f)
                curveToRelative(-1.1f, -5.6f, -6f, -9.7f, -11.8f, -9.7f)
                horizontalLineToRelative(-16.8f)
                curveToRelative(-7.8f, 0f, -13.5f, 7.3f, -11.7f, 14.8f)
                curveToRelative(8f, 32.6f, 26.7f, 109.5f, 33.2f, 136f)
                curveToRelative(1.3f, 5.4f, 6.1f, 9.1f, 11.7f, 9.1f)
                horizontalLineToRelative(25.2f)
                curveToRelative(5.5f, 0f, 10.3f, -3.7f, 11.6f, -9.1f)
                lineToRelative(17.9f, -71.4f)
                curveToRelative(1.5f, -6.2f, 2.5f, -12f, 3f, -17.3f)
                lineToRelative(2.9f, 17.3f)
                curveToRelative(0.1f, 0.4f, 12.6f, 50.5f, 17.9f, 71.4f)
                curveToRelative(1.3f, 5.3f, 6.1f, 9.1f, 11.6f, 9.1f)
                horizontalLineToRelative(24.7f)
                curveToRelative(5.5f, 0f, 10.3f, -3.7f, 11.6f, -9.1f)
                curveToRelative(20.8f, -81.9f, 30.2f, -119f, 34.5f, -136f)
                curveToRelative(1.9f, -7.6f, -3.8f, -14.9f, -11.6f, -14.9f)
                horizontalLineToRelative(-15.8f)
                close()
            }
        }.build()
        
        return _FileWord!!
    }

private var _FileWord: ImageVector? = null

