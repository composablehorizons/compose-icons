package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileCode: ImageVector
    get() {
        if (_FileCode != null) return _FileCode!!
        
        _FileCode = ImageVector.Builder(
            name = "file-code",
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
                curveToRelative(6.365f, 0f, 12.47f, 2.529f, 16.971f, 7.029f)
                lineToRelative(97.941f, 97.941f)
                arcTo(24.005f, 24.005f, 0f, false, true, 384f, 121.941f)
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
                moveTo(123.206f, 400.505f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -7.633f, 0.246f)
                lineToRelative(-64.866f, -60.812f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 0f, -7.879f)
                lineToRelative(64.866f, -60.812f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 7.633f, 0.246f)
                lineToRelative(19.579f, 20.885f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -0.372f, 7.747f)
                lineTo(101.65f, 336f)
                lineToRelative(40.763f, 35.874f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 0.372f, 7.747f)
                lineToRelative(-19.579f, 20.884f)
                close()
                moveToRelative(51.295f, 50.479f)
                lineToRelative(-27.453f, -7.97f)
                arcToRelative(5.402f, 5.402f, 0f, false, true, -3.681f, -6.692f)
                lineToRelative(61.44f, -211.626f)
                arcToRelative(5.402f, 5.402f, 0f, false, true, 6.692f, -3.681f)
                lineToRelative(27.452f, 7.97f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 3.68f, 6.692f)
                lineToRelative(-61.44f, 211.626f)
                arcToRelative(5.397f, 5.397f, 0f, false, true, -6.69f, 3.681f)
                close()
                moveToRelative(160.792f, -111.045f)
                lineToRelative(-64.866f, 60.812f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -7.633f, -0.246f)
                lineToRelative(-19.58f, -20.885f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 0.372f, -7.747f)
                lineTo(284.35f, 336f)
                lineToRelative(-40.763f, -35.874f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -0.372f, -7.747f)
                lineToRelative(19.58f, -20.885f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 7.633f, -0.246f)
                lineToRelative(64.866f, 60.812f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -0.001f, 7.879f)
                close()
            }
        }.build()
        
        return _FileCode!!
    }

private var _FileCode: ImageVector? = null

