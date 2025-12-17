package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileImage: ImageVector
    get() {
        if (_FileImage != null) return _FileImage!!
        
        _FileImage = ImageVector.Builder(
            name = "file-image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 121.941f)
                verticalLineTo(128f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.059f)
                arcToRelative(24f, 24f, 0f, false, true, 16.97f, 7.029f)
                lineToRelative(97.941f, 97.941f)
                arcToRelative(24.002f, 24.002f, 0f, false, true, 7.03f, 16.971f)
                close()
                moveTo(248f, 160f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.745f, 0f, 0f, 10.745f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                close()
                moveToRelative(-135.455f, 16f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.491f, -48f, 48f, -48f)
                close()
                moveToRelative(208f, 240f)
                horizontalLineToRelative(-256f)
                lineToRelative(0.485f, -48.485f)
                lineTo(104.545f, 328f)
                curveToRelative(4.686f, -4.686f, 11.799f, -4.201f, 16.485f, 0.485f)
                lineTo(160.545f, 368f)
                lineTo(264.06f, 264.485f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0f)
                lineTo(320.545f, 304f)
                verticalLineToRelative(112f)
                close()
            }
        }.build()
        
        return _FileImage!!
    }

private var _FileImage: ImageVector? = null

